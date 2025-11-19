def find_by_id(data,id):
    for i in data:
        if (i["id"] == id):
            return i
    return None

def find_by_score(data, min_score):
    ds = []
    s = "score"
    for i in data:
        if (i[s] >= min_score):
            ds.append(i)
    return ds

def sort_by_score(data, reverse=False):
    if (reverse):
        return sorted(data, key = lambda x : x["score"], reverse = True)
    return sorted(data, key = lambda x : x["score"], reverse = False)

def add_student(data, student_dict):
    if ("id" in student_dict) and ("name" in student_dict) and ("score" in student_dict):
        data.append(student_dict)
        return True
    return False

def remove_student(data, id):
    for i in data:
        if (i["id"] == id):
            data.remove(i)
            return data
    return data

def statistics(data):
    min_score = 9999999
    max_score = 0
    avg_score = 0
    min_score_dict = {}
    max_score_dict = {}
    for i in data:
        avg_score += i["score"]
        if (min_score > i["score"]):
            min_score_dict = i
            min_score = i["score"]
        if (max_score < i["score"]):
            max_score_dict = i
            max_score = i["score"]
    return (avg_score / len(data), min_score_dict, max_score_dict)

students = [
    {"id": 1, "name": "An", "score": 8.5},
    {"id": 2, "name": "Bình", "score": 7.2},
    {"id": 3, "name": "Chi", "score": 9.0}
]

print(find_by_id(students, 2))
print(find_by_score(students, 8.0))
print(sort_by_score(students))
print(add_student(students, {"id":4,"name":"Dũng","score":6.8}))
print(statistics(students))