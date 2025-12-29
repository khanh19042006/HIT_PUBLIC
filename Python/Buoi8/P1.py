import cv2 as cv

# Đọc ảnh
img = cv.imread("OpenCV/Resources/Photos/cats.jpg", cv.IMREAD_COLOR)
cv.imshow("Cats", img)
cv.waitKey(0)

#Đọc video
video = cv.VideoCapture("OpenCV/Resources/Videos/dog.mp4")
while True:
    ret, frame = video.read()
    if not ret:
        break
    cv.imshow("dog", frame)
    if cv.waitKey(20) == ord('d'):
        break

#Giải phóng tài nguyên
video.release()
cv.destroyAllWindows()

print("Hoàn thành bài 1")