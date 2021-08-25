import socket
import random
s = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
port = 2500
s.bind(("",port))
print ("Listening....")

while True:
    data,address = s.recvfrom(1024)
    if random.randint(1, 10)<4 :
        print ("packet from {} lost!!!".format(address))
        continue
    print("Mesage is {!r} from {}".format(data.decode(),address))

    s.sendto('ACK'.encode(),address)