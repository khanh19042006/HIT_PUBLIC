import cv2 as cv
import numpy as np

# 1. Đọc ảnh `Resources/Photos/park.jpg`
img = cv.imread("C:/Users/lam05/Downloads/HIT/HIT/Python/Buoi8/OpenCV/Resources/Photos/park.jpg", cv.IMREAD_COLOR)
cv.imshow("img", img)

# 2. Resize ảnh về 600x600 pixels
img2 = cv.resize(img,(600,600))
img2_new = img2.copy()
cv.imshow("img2", img2)

# 3. Chuyển sang HSV và tách các channels
img3 = cv.cvtColor(img,cv.COLOR_BGR2HSV)
h, s, v = cv.split(img3)
cv.imshow("img3", img3)
cv.imshow("h", h)
cv.imshow("s", s)
cv.imshow("v", v)

# 4. Áp dụng Gaussian Blur với kernel 5x5
img4 = cv.GaussianBlur(v,(5,5),0)
cv.imshow("img4", img4)

# 5. Phát hiện cạnh bằng Canny
img5 = cv.Canny(img4,100,200)
cv.imshow("img5", img5)

# 6. Tìm và vẽ tất cả contours lên ảnh gốc
contours, hier = cv.findContours(img5,cv.RETR_LIST,cv.CHAIN_APPROX_SIMPLE)
cv.drawContours(img2, contours, -1,(0,255,0),2)
cv.imshow("img6", img2)

# 7. Thêm text thông tin: số contours tìm được
cout = len(contours)
cv.putText(img2,
           f"Count: {cout}",
           (10,30),
           cv.FONT_HERSHEY_SIMPLEX,
           1,
           (0,0,255),
           2)
# Thêm watermark
cv.putText(img2, 'OpenCV Project', (10, img2.shape[0] - 10),
           cv.FONT_HERSHEY_SIMPLEX, 0.7, (255, 255, 255), 2)
cv.imshow("img7", img2)

# 8. Lưu kết quả ra file
cv.imwrite("C:/Users/lam05/Downloads/HIT/HIT/Python/Buoi8/B8.png", img2)

#Tạo môt composite image để so sánh
#Stack ản gốc và kết quả cạnh nhau
compa = np.hstack([img2_new, img2])
cv.imshow('6. Comparison: Original vs Processed', compa)

cv.waitKey(0)
cv.destroyAllWindows()
print ("Hoàn thành bài 8")