import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

#loc là nhãn
#iloc là stt

# 1. Đọc dữ liệu
# Mô tả: Load file CSV từ Kaggle: heart.csv vào DataFrame df.
df = pd.read_csv('heart.csv')

#===========================================================================================================================
#===========================================================================================================================
# 2. Xem nhanh dữ liệu ban đầu
# Mô tả:
# + Hiển thị 5 dòng đầu (df.head()).
# + Xem cấu trúc dữ liệu: số dòng/cột, kiểu dữ liệu, missing values (df.info()).

# print(df.head()) # Chỉ lấy 5 hàng đầu
# print(df)

# In ra tất cả hàng, cột và giá trị từng ô
pd.set_option('display.max_columns', None)  # Hiển thị tất cả các cột
pd.set_option('display.max_rows', None)  # Hiển thị tất cả các hàng
pd.set_option('display.max_colwidth', None)  # Không rút gọn chuỗi trong ô
# print(df)

# Khôi phục về mặc định ban đầu
pd.reset_option('display.max_columns')
pd.reset_option('display.max_colwidth')
pd.reset_option('display.max_rows')

# Kiểm tra cấu trúc
# print(df.info())      # entries là số hàng, total là số cột, (số thứ tự cột, tên cột, số giá trị, kiểu dữ liệu)

#===========================================================================================================================
#===========================================================================================================================
# 3. Tiền xử lý dữ liệu dạng categorical → numeric (encoding thủ công)
# Mô tả:
# + Chuyển Sex: M → 1, F → 2.
# + Chuyển ChestPainType: ATA → 1, NAP → 2, ASY → 3, TA → 4.
# + Chuyển RestingECG: Normal → 1, ST → 2, LVH → 3.
# + Chuyển ExerciseAngina: N → 1, Y → 2.
# + Chuyển ST_Slope: Up → 1, Flat → 2, Down → 3.

# print(df.head())
Sex_map = {"M": 1, "F": 2}
ChestPainType_map = {"ATA" : 1, "NAP" : 2, "ASY" : 3, "TA" : 4}
RestingECG_map = {"Normal" : 1, "ST" : 2, "LVH" : 3}
ExerciseAngina_map = {"N": 1, "Y" : 2}
ST_Slope_map = {"Up" : 1, "Flat" : 2, "Down" : 3}

df["Sex_num"] = df["Sex"].map(Sex_map)
df["ChestPainType_num"] = df["ChestPainType"].map(ChestPainType_map)
df["RestingECG_num"] = df["RestingECG"].map(RestingECG_map)
df["ExerciseAngina_num"] = df["ExerciseAngina"].map(ExerciseAngina_map)
df["ST_Slope"] = df["ST_Slope"].map(ST_Slope_map)
# print (df.head())

#===========================================================================================================================
#===========================================================================================================================
# 4. Kiểm tra lại sau khi encode
# Mô tả: Xem lại info để đảm bảo các cột đã đổi sang kiểu số (df.info()).

# print(df.info())

#===========================================================================================================================
#===========================================================================================================================
# 5. Khám phá kích thước dữ liệu
# Mô tả: Lấy số dòng/cột (df.shape).

# print(df.shape)     #Hiển thị (số_dòng, số_cột)

#===========================================================================================================================
#===========================================================================================================================
# 6. Thống kê mô tả
# Mô tả: Xem thống kê cơ bản cho các cột số (df.describe()).

# print(df.describe())
# count → số giá trị không thiếu
# mean → trung bình cộng
# std → độ lệch chuẩn (biểu thị độ phân tán)
# min / max → giá trị nhỏ nhất / lớn nhất
# 25%, 50%, 75% → các phần trăm phân vị (quartiles)

#===========================================================================================================================
#===========================================================================================================================
# 7. Kiểm tra dữ liệu bất thường (giá trị bằng 0)
# Mô tả:
# + Đếm số dòng có Cholesterol == 0.
# + Đếm số dòng có RestingBP == 0.
# + Lọc và hiển thị các dòng có RestingBP == 0.

# Các cột Cholesterol, RestingBP trong điều kiện bình thường không thể có giá trị là 0
# nếu bằng 0 chứng tỏ có lỗi nhập giá trị hoặc giá trị bị thiếu hay nhập sai
# Nên ta coi những giá trị này là giá trị bất thường

cnt_Cholesterol = (df["Cholesterol"] == 0).sum()
# print ("Số dòng Cholesterol = 0:", cnt_Cholesterol)

cnt_RestingBP = (df["RestingBP"] == 0).sum()
# print("Số dòng RestingBP = 0:", cnt_RestingBP)

df_RestingBP_0_ver1 = df[df["RestingBP"] == 0]
# print(df_RestingBP_0_ver1)
df_RestingBP_0_ver2 = df.loc[df["RestingBP"] == 0]
# print(df_RestingBP_0_ver2)

# .loc[hàng, cột]
df_RestingBP_0_ver3 = df.loc[df["RestingBP"] == 0, ["Age", "Sex"]]
# print(df_RestingBP_0_ver3)

#===========================================================================================================================
#===========================================================================================================================
# 8. Loại bỏ cột không dùng
# Mô tả: Xóa cột Cholesterol khỏi dataset (drop axis=1).

pd.set_option('display.max_columns', None)
# print(df)
df_new = df.drop("Cholesterol", axis=1)     #axis = 1 là xóa cột, 0 là xóa hàng
# print(df_new.head())

pd.reset_option('display.max_columns')

# df_new = df.drop("Cholesterol", axis=1, inplace=True) #Xóa bản gốc

#===========================================================================================================================
#===========================================================================================================================
# 9. Loại bỏ dòng dữ liệu cụ thể
# Mô tả: Xóa dòng có index = 4 (df.drop(4)).

df_new = df.drop(4)     #Tương đương .drop(4, axis=0)
# print (df_new.head())
# print (df.head())

#===========================================================================================================================
#===========================================================================================================================
# 10. Kiểm tra kích thước sau khi xóa
# Mô tả: Xem lại df.shape để xác nhận dữ liệu đã thay đổi.

# print(df_new.shape)
# print(df.shape)

#===========================================================================================================================
#===========================================================================================================================
# 11. Kiểm tra dữ liệu thiếu
# Mô tả: Tính tổng số giá trị null theo từng cột (df.isnull().sum()).

# print(df.isnull().sum())

# .isnull() trả về 1 dataFrame kiểu True/False, True = 1, False = 0
# dùng axis để điều chỉnh tính theo cột hoặc hàng

#===========================================================================================================================
#===========================================================================================================================
# 12. Trực quan hóa phân phối các biến
# Mô tả: Vẽ histogram cho tất cả cột (kích thước figure lớn, layout gọn).

numeric_cols = df.select_dtypes(include='number').columns       #Lấy danh sách các cột có kiểu số (number)

fig = plt.figure(figsize=(20,5))

axes = []
for i in range (len(numeric_cols)):
    ax = fig.add_subplot(1, len(numeric_cols), i+1)
    #ax là 1 ô nhỏ trên biểu đồ (số hàng, số cột, số thứ tự)
    #Số hàng: sẽ ảnh hưởng đến tỷ lệ chiều cao của biểu đồ, 2 thì biểu đồ sẽ cao 1/2
    #Số cột: giúp các cột đều có đủ chỗ để biểu diễn
    #Số thứ tự: trong figure bắt đầu từ 1, ảnh hưởng đến thứ tự khi biểu diễn
    axes.append(ax)

# fig, axes = plt.subplots(nrows=1, ncols=len(numeric_cols), figsize=(15,5))
# fig, axes = plt.subplots(nrows=3, ncols=4, figsize=(20,20))
# axes = axes.flatten()     #trải phẳng mảng 2D

for i, col in enumerate(numeric_cols):
    axes[i].hist(df[col], bins=5, color='skyblue', edgecolor='black', alpha=1)
    # bin : số cột, color : màu cột, edgecolor : màu viền cột, alpha : độ trong suốt của cột (0-1)
    axes[i].set_title(col)  #Gán nhãn cho các biểu đồ
    plt.tight_layout()      #Điều chỉnh để các biểu đồ không bị đè lên nhau
# plt.show()
plt.close()

#===========================================================================================================================
#===========================================================================================================================
# 13. Kiểm tra lại null lần nữa
# Mô tả: Chạy lại df.isnull().sum() để xác nhận không có thiếu dữ liệu (hoặc vẫn còn).

cnt = df.isnull().sum()
# print(cnt)

#===========================================================================================================================
#===========================================================================================================================
# 14. Phân bố nhãn mục tiêu
# Mô tả: Đếm số lượng từng lớp của HeartDisease (value_counts()).

# print(df["HeartDisease"].value_counts())        #giá trị duy nhất   :    số lượng

#===========================================================================================================================
#===========================================================================================================================
# 15. Vẽ biểu đồ tròn (pie chart) cho HeartDisease
# Mô tả:
# Dùng Plotly Pie để thể hiện tỷ lệ:
# + “Have heart disease” vs “Do not have heart disease”
# + Set màu theo từng nhóm.

counts = df['HeartDisease'].value_counts().sort_index()     # sort_index() để đảm bảo 0 trước, 1 sau
values = counts.values                                      # trả về 1 list chứa số lượng các giá trị duy nhất

# Gán nhãn
labels = ['Do not have heart disease', 'Have heart disease']

# Gán màu tương ứng
colors = ['skyblue', 'salmon']

# Vẽ biểu đồ tròn
plt.figure(figsize=(6,6))
plt.pie(
    values,               # số lượng từng nhóm
    labels=labels,        # nhãn hiển thị
    colors=colors,        # màu từng nhóm
    autopct='%1.1f%%',    # hiển thị phần trăm trên từng miếng  ([tổng số ký tự, thiếu thì tự thêm khoảng trắng bên trái], [số chữ số sau dấu phẩy])
    startangle=90         # xoay biểu đồ để miếng đầu tiên bắt đầu từ trên
)
plt.title("Distribution of Heart Disease")  # Tên biểu đồ
# plt.show()
plt.close()     #plt.close("all")       Đóng figure hiện tại hoặc tất cả

#===========================================================================================================================
#===========================================================================================================================
# 16. Vẽ biểu đồ cột theo giới tính
# Mô tả:
# +  Dùng seaborn countplot cho Sex.
# +  Gắn nhãn số lượng lên đỉnh từng cột (bar labels).

count = df["Sex"].value_counts()
label = ["Male", "Female"]
colors = ['skyblue', 'salmon']
values = count.values

plt.figure(figsize=(10,10))

plt.bar(
    label,              # Nhãn trục x
    values,             # Chiều cao của cột
    color=colors,       # Màu của cột
    edgecolor='black',  # Màu viền của cột
    width = 0.3,        # Độ rộng của cột
)
plt.xlabel("Giới tiính")
plt.ylabel("Số lượng")
plt.title("Biểu đồ giới tính")
# plt.show()
plt.close()

# fig = plt.figure(figsize=(10,10))
# ax = fig.add_axes([0.2, 0.2, 0.3, 0.6])
#
# # plt.figure(figsize=(10,10))
# ax.bar(
#     label,              # Nhãn trục x
#     values,             # Chiều cao của cột
#     color=colors,       # Màu của cột
#     edgecolor='black',  # Màu viền của cột
#     width = 0.1,        # Độ rộng của cột
# )
# ax.set_xlabel("Giới tiính")
# ax.set_ylabel("Số lượng")
# ax.set_title("Biểu đồ giới tính")
# plt.show()