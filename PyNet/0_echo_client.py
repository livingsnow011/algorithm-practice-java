import socket
import sys
import argparse

host = "localhost"

def echo_client(port):
    sock = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    server_address = (host,port)
    print("Connectiong to %s port %s" %server_address)

    #데이터 송신
    try:
        message = "this will be echoed"
        print("Sending %s" %message)
        sock.sendall(message)
        # 응답 찾기
        amount_received = 0
        amount_expected = len(message)
        while (amount_received<amount_expected):
            data = sock.recv(16)
            amount_received+= len(data)
            print ("received :%s" %data)
    except socket.errno as e:
        print ("Socket error : %s" %str(e))
    except Exception as e:
        print("Other exception : %s" %str(e))
    finally:
        print ("Closing connection to the server")
        sock.close()

echo_client(9900)
