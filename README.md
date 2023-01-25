# 25-01-2023
WS22 - IO und Exceptions


### 📝 Aufgabe:
Die Datei im Projekt unter ```"files/faust.txt"``` beinhaltet  Göthes Faust als txt-Datei.
- Lest die Datei byte-weise in euer Java-Programm ein und lasst euch in Echtzeit über ```System.out.print()``` (ohne 'ln') ausgeben was ihr aus der Datei lest:
  - legt dafür zuerst einen  ```try-catch-block``` an in dem ihr eine ```FileNotFoundException``` abfangen könnt
  - erzeugt darin dann einen ```FileInputStream``` und übergegt dem Konstruktor den Pfad der Datei ```"files/faust.txt"```
  - speichert den Inhalt des ersten "bytes" in einen ```int temp``` über die Methode ```.read()```
  - fügt in den ```try-catch-block``` eine ```catch``` Anweisung für eine ```IOException``` ein
  - schreibt eine ```while-Schleife``` die läuft, solange der ```temp``` gößer oder gleich 0 ist:
    - in der Schleife gebt ihr jetzt über ```System.out.print()```  den zu einem ```char``` gecasteten ```int temp``` aus
    - setzt den ```int temp``` in der Schleife jetzt über ```.read()``` auf den nächsten wert im stream an
  - außerhalb der Schleife schließt ihr nun den stream wieder

  ### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos
