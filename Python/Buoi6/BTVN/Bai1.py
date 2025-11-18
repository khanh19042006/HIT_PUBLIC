def remove_punctuation(s):
    news = ""
    for i in range (len(s)):
        if (s[i] >= "a" and s[i] <= "z") or (s[i] >= "A" and s[i] <= "Z"):
            news += s[i]
    return news

def to_lower(s):
    news = lower(s)
    return news

def remove_stopwords(s, stopwords):
    news = ""
    s = s.split()
    for i in range (len(s)):
        if not (s[i] in stopwords):
            news += s[i]
    return news

def pipeline(s, functions):
    