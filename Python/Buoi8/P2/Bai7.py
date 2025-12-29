import cv2 as cv

img = cv.imread("C:/Users/lam05/Downloads/HIT/HIT/Python/Buoi8/OpenCV/Resources/Photos/cats.jpg", cv.IMREAD_COLOR)
# 1. Average Blur
img1 = cv.blur(img,(5,5))
cv.imshow("img1", img1)

# 2. Gaussian Blur
img2 = cv.GaussianBlur(img,(5,5),0)
cv.imshow("img2", img2)

# 3. Median Blur
img3 = cv.medianBlur(img,5)
cv.imshow("img3", img3)

# 4. Bilateral Filter
img4 = cv.bilateralFilter(img,9,75,75)
cv.imshow("img4", img4)

cv.waitKey(0)
cv.destroyAllWindows()

print("Hoàn thành bài 7")