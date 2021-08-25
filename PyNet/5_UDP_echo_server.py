import socket

s = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
BUFSIZE = 1024
port = 2500

s.bind(("",port))
while True:
    data, addr = s.recvfrom(BUFSIZE)
    print("received msg,",data.decode())

    s.sendto(data,addr)