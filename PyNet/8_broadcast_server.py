from socket import *

sock = socket(AF_INET,SOCK_DGRAM) # UDP, 브로드캐스트
sock.setsockopt(SOL_SOCKET, SO_REUSEADDR, 1) # 주소 재사용
sock.bind(("",10000))

while True:
    msg,addr = sock.recvfrom(1024)
    print(msg.decode())
