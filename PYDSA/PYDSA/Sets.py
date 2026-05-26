
# SETS Unordered and Indexed

evenumbers = {2, 4, 6, 8}

print(evenumbers)
print(len(evenumbers))

evenumbers.add(12)
print(evenumbers)

# ADD MULTIPLE ITEMS IN THE SET
evenumbers.update([14,16,18])
print(evenumbers)

# REMOVE MAG EEROR KAPAG WALA SA SET
evenumbers.remove(18)
print(evenumbers)

# DISCARD HINDI MAG EEROR KAPAG WALA SA SET
evenumbers.discard(16)
print(evenumbers)

# REMOVE THE 1st ITEM IN THE SET
evenumbers.pop()
print(evenumbers)

# CLEAR DELETE ALL VALUE INSIDE THE SET
evenumbers.clear()
print(evenumbers)

# COPY SET INTO ANOTHER SET
setTwo = evenumbers.copy()
print(setTwo)

# UNION SET MAIN PURPOSE OF SET
print("UNION")
oddNumbers = {1,3,5,7}
evenumbers1 = {2,4,6,8}
numbers = oddNumbers.union(evenumbers1)
print(numbers)

# DIFFERENCE
print("DIFFERENCE")
setD1 = {1,2,3,4,7,6}
setD2 = {3,4}
setTotal = setD1.difference(setD2)
print(setTotal)

# INTERSECTION
print("INTERSECTION")
setInter = {1,2,3,4,5}
setInter1 = {4,5}
setInterTotal = setInter.intersection(setInter1)
print(setInterTotal)

# SYMMETRIC DIFFERENCE
print("SYMMTERIC DIFFERENCE")
symSet1 = {1,2,3,4}
symSet2 = {3,4}
symSettotal = symSet1.symmetric_difference(symSet2)
print(symSettotal)

# DISJOINT PAG MAY KAMUKA KAHIT ISA HINDI NA DISJOINT
print("DISJOINT")
dj1 = {1,2,3,4}
dj2 = {1,2,3,4}
djtotal = dj1.isdisjoint(dj2)
print(djtotal)

# CASTING
print("CASTING")
numBers = {1, 2, 3, 4, 5, 6} # SET
print(numBers)

# CONVERTED TO LIST
numBers = list(numBers)
numBers[0] = "HATDOG"
print(numBers)

# CONVERTED TO TUPLE
numBers = tuple(numBers)
print(numBers)

