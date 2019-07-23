# EPAM-Java0
MainTask2v0.2
Update from 27.01.2019
1. Methods addComposition(Composition composition) & removeComposition(Composition composition) are in Disk class as tools for working with 2. container.
3. Enum's are removed from packages.
4. Enum "MainInstrument" renamed to "InstrumentType".
5. Duration class modified. Now it contains only totalSeconds; hours, minutes & seconds are generating only when method toString() is called.
6. DurationManager class removed.
7. LinkedList modified to ArrayList.
8. Method listToString() of Disk class removed. Now convient view of list is generating only when method toString() is called.
9. Exceptions in constructors removed. If date isn't valide, default constructor is called.
10. Set- & get- methods validate date by means of exceptions.
11. Comparators moved to package "comparators".
12. Compositions class isn't abstract. Now it is possible to create an object of this class.
13. Field "duration" of Disk class removed. Now it is possible to get duration of disk by calling method "getDuration()".
