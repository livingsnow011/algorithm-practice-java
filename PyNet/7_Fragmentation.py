frame = []
msg = input("your msg\n")
size = 4
for i in range (0,len(msg),size):
    frame.append(msg[i:i+size])

print("단편화 메세지: {}".format(frame))
print("재조립 메시지: {}".format("".join(frame)))