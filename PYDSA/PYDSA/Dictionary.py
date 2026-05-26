# DICTIONARY KEY VALUE PAIR
# HASHTABLE IN OTHER LANGUAGE
# NESTED DICTS
studentOneAttrib = {
    "Height" : 172,
    "Weight" : 12,
    "Skin" : "Brown"
}
studentOne = {
    "Name": "Cloud",
    "Course": "BSCS",
    "Age": 19
}
studentTwo = {
    "Name": "Test",
    "Course": "BSCS",
    "Age": 19,
    "Physical" : studentOneAttrib # NESTED DICTS
}

print(studentOne)

# SPECIFIC PRINT print(dict[key])
print(studentTwo["Course"])
print(studentOne.get("Name"))

# CHANGE VALUE
studentOne["Name"] = "Jisoo"
print(studentOne.get("Name"))

# SIZE OF DICT
print(len(studentOne))

# ADD ITEM
studentOne["Gender"] = "Male"
print(studentOne.get("Gender"))

# DELETE || popitem() delete the last inserted item
studentOne.pop("Name")
studentOne.popitem()
# studentOne.clear()
print(studentOne)

# copy
studentThree = studentOne.copy()
print(studentThree)

# GETTING ALL THE KEYS || VALUES
print(studentOne.keys())
print(studentTwo.values())

# DICTS INSIDE A LIST
students = [studentOne,studentTwo]
print(students)
print(students[1].get("Name")) # SPECIFIC PRINT

# NESTED DICTS
print(studentTwo.get("Physical").get("Height"))