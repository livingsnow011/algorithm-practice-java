import asyncio

async def tcp_echo_client(msg,loop):
    reader,writer = await asyncio.open_connection("localhost",2500,loop=loop)
    print (" Send : %r " %msg)
    writer.write(msg.encode())
    data = await reader.read(100)
    print("received: %r " % data.decode())
    print("close the socket")
    writer.close()

msg = "hello world"
loop = asyncio.get_event_loop()
loop.run_until_complete(tcp_echo_client(msg, loop))
loop.close()