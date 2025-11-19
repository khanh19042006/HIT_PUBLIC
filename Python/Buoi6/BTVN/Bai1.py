def remove_punctuation(s):
    news = ""
    for i in range (len(s)):
        if (s[i] >= "a" and s[i] <= "z") or (s[i] >= "A" and s[i] <= "Z") or (s[i] == " "):
            news += s[i]
    return news

def to_lower(s):
    news = s.lower()
    return news

def remove_stopwords(s, stopwords):
    news = ""
    s = s.split()
    for i in range (len(s)):
        if not (s[i] in stopwords):
            news += s[i]
    return news

def count_words(s):
    dict = {}
    for i in range (len(s)):
        if not (s[i] in dict):
            dict[s[i]] = 1
        else:
            dict[s[i]] += 1
    return dict

stop_word = ["is", "a", "this"]
s = input()
s = remove_punctuation(s)
print("1", s)
s = to_lower(s)
print ("2", s)
s = remove_stopwords(s, stop_word)
print("3", s)
s = count_words(s)
print("4", s)