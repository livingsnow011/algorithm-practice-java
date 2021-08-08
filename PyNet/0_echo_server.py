
import sys
import socket
import argparse

host = "localhost"
data_payload = 2048
backlog = 5

def echo_server(port):
    # tcp 소켓 생성
    sock = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    # 포트 재사용 가능
    sock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    # 소켓과 포트 바인딩
    server_address = (host,port)
    print("Starting up echo server on %s port %s" %server_address)
    sock.bind(server_address)

    sock.listen(backlog)

    while True:
        print("Waiting to receive message from client")
        client, address = sock.accept() 
        data = client.recv(data_payload)
        if data:
            print ("Data : %s" %data)
            client.send(data)
            print("sent %s btyes back to %s" %(data,address))
            client.close()
            print("End connection")


    echo_server(9900)
