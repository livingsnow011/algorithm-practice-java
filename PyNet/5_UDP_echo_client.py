import socket

s = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
port = 2500
buf = 1024

msg = input()
s.sendto(msg.encode(), ('localhost',port))
data, addr = s.recvfrom(buf)
print("Server says : ",data.decode())