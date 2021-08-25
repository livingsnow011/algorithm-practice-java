import asyncio , time

# delay 만큼 대기 -> 실행
async def say (what,delay):
    await asyncio.sleep(delay)
    print(what)

loop = asyncio.get_event_loop()
print(f"started at {time.strftime('%X')}")

loop.run_until_complete(say("hello",5))
print(f"started at {time.strftime('%X')}")

loop.close()