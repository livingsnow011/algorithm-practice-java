import asyncio

async def say(what,delay):
    await asyncio.sleep(delay)
    print(what)

loop = asyncio.get_event_loop()
#태스크 생성
task1 = loop.create_task(say("first hello",2))
task2 = loop.create_task(say("second hello",1))

loop.run_until_complete(task1)
loop.run_until_complete(task2)

loop.close()