from socket import *
import struct

buf = 1024
group_addr = "224.0.0.255"
rs = socket(AF_INET,SOCK_DGRAM)
rs.setsockopt(SOL_SOCKET, SO_REUSEADDR, 1)
rs.bind(("",5005))

mreq = struct.pack("4sl",inet_aton(group_addr),INADDR_ANY)
rs.setsockopt(IPPROTO_IP, IP_ADD_MEMBERSHIP, mreq)
print("Ready to receive")

while True:
    rmsg , addr = rs.recvfrom(buf)
    print("received {} from ({},{})".format(rmsg.decode(),*addr))
    rs.sendto("ACK".encode(), addr)