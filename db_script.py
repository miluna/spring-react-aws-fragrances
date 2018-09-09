import requests
import json

URL = "http://localhost:8080/fragrances"
with open("fragancias.txt", "r") as file:
    content = file.read().split("\n")

# print(content)
headers = {
    "Content-Type": "application/json; charset=utf8"
}
for f in content:
    num = f.split(" ")[0]
    text = f.replace(num, "").strip()

    fragrance = {}
    fragrance["number"] = num
    fragrance["name"] = text
    r = requests.post(headers=headers, url=URL, data=json.dumps(fragrance))
    print(r.status_code)

print("FINISHED")
