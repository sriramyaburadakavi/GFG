def insert_dict(query, dict):
    key = query[1]
    value = int(query[2])
    dict[key] = value


def del_dict(query, dict):
    key = query[1]
    if key in dict:
        del dict[key]


def print_dict(key, dict):
    if key in dict:
        print(f"Marks of {key} is {dict[key]}")
    else:
        print(-1)