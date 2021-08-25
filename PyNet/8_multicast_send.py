from socket import *
import struct
group_addr = ("224.0.0.255",5005) # group address
s = socket(AF_INET,SOCK_DGRAM)
s.settimeout(0.5)
TTL = struct.pack("@i",2) # TTL 2 4바이트 정수형으로 표현
s.setsockopt(IPPROTO_IP,IP_MULTICAST_TTL, TTL)
s.setsockopt(IPPROTO_IP, IP_MULTICAST_LOOP, False)

while True:
    rmsg = input ("ur msg: ")
    s.sendto(rmsg.encode(),group_addr)

while True:
    try:
        response, addr =s.recvfrom(1024)
    except:
        break
    else:
        print("{} from {}".format(response.decode(),addr))