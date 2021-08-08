import socket
import sys
import ntplib
from time import ctime
import time
import struct
# 흔히 일어나는 포트 재사용 에러 
# SO_REUSEADDR 을 이용해 해결 

def reuse_socket_addr():
    s = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    
    old_state = s.getsockopt(socket.SOL_SOCKET,socket.SO_REUSEADDR)
    print ("Old sock state : %s" %old_state)

    s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    new_state = s.getsockopt(socket.SOL_SOCKET,socket.SO_REUSEADDR)
    print ("New sock state : %s" %new_state)

    local_port = 8282

    srv = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    srv.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    srv.bind ( ('',local_port) )
    srv.listen(1)
    print("Listening on port : %s" %local_port)
    while 1:
        try:
            connection, addr = srv.accept()
            print("connected by %s : %s" %(addr[0],addr[1]))
        except KeyboardInterrupt():
            break
        except socket.error as msg:
            print("%s" %msg)

# 인터넷 시간 ntp, sntp
def print_time():
    ntp_client = ntplib.NTPClient()
    response = ntp_client.request('pool.ntp.org')
    print (ctime(response.tx_time ))
