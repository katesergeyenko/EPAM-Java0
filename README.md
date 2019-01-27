# EPAM-Java0
MainTask2v0.2
Update from 27.01.2019
Methods addComposition(Composition composition) & removeComposition(Composition composition) are in Disk class as tools for working with container.
Enum's are removed from packages.
Enum "MainInstrument" renamed to "InstrumentType".
Duration class modified. Now it contains only totalSeconds; hours, minutes & seconds are generating only when method toString() is called.
DurationManager class removed.
LinkedList modified to ArrayList.
Method listToString() of Disk class removed. Now convient view of list is generating only when method toString() is called.
Exceptions in constructors removed. If date isn't valide, default constructor is called.
Set- & get- methods validate date by means of exceptions.
Comparators moved to package "comparators".
Compositions class isn't abstract. Now it is possible to create an object of this class.
Field "duration" of Disk class removed. Now it is possible to get duration of disk by calling method "getDuration()".
