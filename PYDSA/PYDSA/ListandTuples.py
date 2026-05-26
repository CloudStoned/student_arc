courses = ["BSCS", "BSIT", "BLIS"]

print(courses)
print(courses[-1])
print(courses[-2])
print(courses[-3])

print(courses[0])
print(courses[1])
print(courses[2])

courses[0] = "BSBS"

# READING LIST OF RANGE
# END INDEX IS EXCLUDED
print(courses[2:3])
print(courses[:2])

# SIZE OF LIST
print(len(courses))

# COUNT LIST
print(courses.count("BSIT"))

# ADD ITEM append ADDS IT AT THE END
courses.append("HATDOG")
courses.append("LINTEK")

# ADD IN SPECIFIC INDEX
courses.insert(0, "project")
courses.insert(5, "LALA")

# REMOVE
courses.remove("LALA")
courses.remove("LINTEK")
print(courses)

# del courses remove list
del courses[1]

# CLEAR LIST
# courses.clear()

print(courses)
courses.pop()
# COPY
x = courses.copy()

print(x)

# COMBINING LIST
food = ["HATDOG", "CHEESEDOG"]
coursesFood = courses + food
courses.append(food)
print(courses)
print(coursesFood)

# REVERSE LIST
coursesFood.reverse()
print(coursesFood)

# SORT list.sort()
# DESCENDING ORDER list.sort(reverse=True)
alpha = ["D", "A", "F"]
print(alpha)

alpha.sort()
print(alpha)

alpha.sort(reverse=True)
print(alpha)

#NESTED LIST
nlist = ["BSCS","BSIT",[["HRM","COOK"],"CHEESEDOG"]]

print(nlist[2][0])
print(nlist[2][1])
print(nlist[2][0][1])

# TUPLES READ ONLY
# CAN'T BE ASSIGNED AND DELETED 1 BY 1

nlist = ["BSCS","BSIT","BLABLA"] # PAG NAGING PARENTHESIS TUPLES NA

nlist = tuple(nlist)
print(nlist)

#CAST LIST TO TUPLE
# tuple(list)

# CAST TUPLE TO LIST
# list(tuple)