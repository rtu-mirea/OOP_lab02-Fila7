#Фамилия Имя Отчество -> Фамилия И.О., xxxx@mail.ru/gmail.com.
import random
res=""
res1=""
with open("D:\snames.txt", 'r', encoding = 'UTF-8') as file:
    for str in file:
        str = str[:len(str)-1]
        s = str.split(" ")
        s[1] = s[1][0]+'.'
        s[2] = s[2][0]+'.'
        r = random.randint(4, 10)
        email = ''
        for i in range(r):
            email+=chr(random.randint(97, 122))
        if random.randint(0, 1):
            email+='@mail.ru.'
        else:
            email+='@gmail.com.'
        res +=s[0]+' '+s[1]+s[2] + ","+email +'\n'
        res1 +=s[0]+' '+s[1]+s[2] + ","+email +'\\n'
with open("D:\snames.txt", 'w', encoding = 'UTF-8') as file:
    file.write(res)
    file.write(res1)
