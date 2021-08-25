import asyncio

# 연결 후 호출되는 콜백함수
async def hadle_echo(reader,writer):
    data = await reader.read(100)  # 데이터 읽기
    msg = data.decode()
    addr = writer.get_extra_info('peername')
    print("received: %r from %r" %(msg,addr))

    print("send: %r "%msg)
    writer.write(data) # 데이터 전송
    await writer.drain()
    print("Close the client socket")
    writer.close()

loop = asyncio.get_event_loop()
coro = asyncio.start_server(hadle_echo, "localhost",2500, loop=loop)

task = loop.create_task(coro)

print("Serving.....")
loop.run_forever()


