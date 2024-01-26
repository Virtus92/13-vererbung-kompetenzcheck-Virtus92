# Vererbung - Kompetenzcheck

Implementiere ein Programm, dass Fahrzeuge verwaltet. Ein Fahrzeug hat zumindest folgende Eigenschaften:
- gehört zu einer Person/Firma
- hat eine definierte Anzahl an Rädern
- hat ein bestimmtes Gewicht

Ein Fahrzeug kann:
- huppen
- von A nach B fahren
- eine Durchschnittsgeschwindigkeit

Als Fahrzeug gelten PKW, LKW und Fahrrad.

Ein PKW hat:
- 4 Räder
- einen Motor
- eine bestimmte Anzahl an PS
- bis zu 7 Sitzplätzen je nach Modell

Ein PKW kann:
- Vollgas geben

Ein LKW hat:
- mindestens 6 Räder
- einen Motor
- eine bestimmte Anzahl an PS
- bis zu 3 Sitzplätzen je nach Modell
- eine bestimmte Menge an Ladegut (max. 10 To)

Ein LKW kann:
- Ladegut transportieren

Ein Fahrrad hat:
- 2 Räder
- 1-2 Sitzplätzen
- eventuell eine Huppe abes nicht immer

Ein Fahrrad kann:
- von einem Menschen geschoben werden
- von einem Menschen angetrieben werden

Ein Lastenfahrrad hat:
- dasselbe wie ein Fahrrad
- Gewicht des Ladegutes (max. Gewicht 100kg)

Ein Lastenfahrrad kann:
- dasselbe wie ein Fahrrad
- zusätzlich kann es Ladegut transportieren

Implementiere die entsprechenden Klassen. Überlege dir gut, ob und welche Klassen und Methoden als abstract definiert werden sollen.

Da die Ausgabe in der Konsole erfolgen soll, erfolgt huppen durch eine Konsolenausgabe. Auch das fahren erfolgt, indem eine Konsolenausgabe folgendes darstellt:
- Abfahrtsort und Abfahrtszeit (jetzt). Die Ausgabe von Datum/Zeit erfolgt im Format: *"JJJJ-MM-TT HH:mm:ss"*
- Dauer der Reise
- Ankunftsort und Ankunftszeit

In deinem Hauptprogramm erstellst du eine Liste mit verschiedensten Fahrzeugen. Anschließend lässt du alle Fahrzeuge von Linz nach Graz (220km), Linz nach Wien (180km), Wien nach Graz (200km) fahren und anschließend wieder retour. 

Zurück zur [Startseite](README.md)
