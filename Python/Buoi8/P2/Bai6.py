import cv2 as cv

img = cv.imread("C:/Users/lam05/Downloads/HIT/HIT/Python/Buoi8/OpenCV/Resources/Photos/cats.jpg", cv.IMREAD_COLOR)

# 1. BGR → Grayscale
img1 = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
cv.imshow("Cat1", img1)
# 2
img2 = cv.cvtColor(img, cv.COLOR_BGR2HSV)
cv.imshow("Cat2", img2)
# 3
img3 = cv.cvtColor(img, cv.COLOR_BGR2LAB)
cv.imshow("Cat3", img3)
# 4
img4 = cv.cvtColor(img, cv.COLOR_BGR2RGB)
cv.imshow("Cat4", img4)
# 5
img5 = cv.cvtColor(img3, cv.COLOR_LAB2BGR)
cv.imshow("Cat5", img5)

cv.waitKey(0)
cv.destroyAllWindows()

print("Hoàn thành bài 6")