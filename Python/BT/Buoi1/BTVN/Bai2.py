s = input()
check = 0
for i in range (len(s)-2):
    if ((s[i] == "h") or (s[i] == "H")) and ((s[i+1] == "i") or (s[i+1] == "I")) and ((s[i+2] == "t") or (s[i+2] == "T")):
        print ("True")
        check = 1
if (not(check)):
    print (False)

check = 0
for i in range (len(s)-1):
    if s[i] == "1" and s[i+1] == "6":
        print ("True")
        check = 1
if not(check):
    print ("False")