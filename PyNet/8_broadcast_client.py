from socket import *

addr = ("<broadcast>",10000)

sock = socket(AF_INET,SOCK_DGRAM)
sock.setsockopt(SOL_SOCKET, SO_REUSEADDR, 1)
sock.setsockopt(SOL_SOCKET, SO_BROADCAST, 1)

while True:
    smsg = input("Broadcast : ")
    sock.sendto(smsgs.encode(), addr)