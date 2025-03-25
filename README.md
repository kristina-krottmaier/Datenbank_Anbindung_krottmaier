## DB Anbindung
- Author: Kristina Krottmaier
- Lehrgang: 3
- Klasse: 2bAPC
- Gruppe: B
- Fach: ITL12
- Datum: 25. März 2025


## Beschreibung
Zuerst habe ich das DB Navigator Plugin und die von Herr Kilian gegebene Libary runtergeladen..  Ich habe die Datenbank itl12_datenbank_krottmaier erstellt, dann habe ich wie vorgegeben 4 Tabellen erstellt: DEPT, EMP, BONUS & SALGRADE


<img width="316" alt="Screenshot 2025-03-25 at 09 03 42" src="https://github.com/user-attachments/assets/e3fb9f59-5513-4c1f-8756-db3465f411cf" />


Dann habe ich mit IntelliJ die Verbindung hergestellt und den code geschrieben der dann die unten angeführte ausgabe hatte!!

## Verwendung
Nach dem Start des Programms wird alles aus der `emp` Tabelle der Datenbank angezeigt.

```bash
empno: 7369, ename: smith, job: clerk
empno: 7499, ename: allen, job: salesman
empno: 7521, ename: ward, job: salesman
empno: 7566, ename: jones, job: manager
empno: 7654, ename: martin, job: salesman
empno: 7698, ename: blake, job: manager
empno: 7782, ename: clark, job: manager
empno: 7788, ename: scott, job: analyst
empno: 7839, ename: king, job: president
empno: 7844, ename: turner, job: salesman
empno: 7876, ename: adams, job: clerk
empno: 7900, ename: james, job: clerk
empno: 7902, ename: ford, job: analyst
empno: 7934, ename: miller, job: clerk
deptno: 10, dname: accounting, loc: new york
deptno: 20, dname: research, loc: dallas
deptno: 30, dname: sales, loc: chicago
deptno: 40, dname: operation, loc: boston
grade: 1, losal: 700, hisal: 1200
grade: 2, losal: 1201, hisal: 1400
grade: 3, losal: 1401, hisal: 2000
grade: 4, losal: 2001, hisal: 3000
grade: 5, losal: 3001, hisal: 9999

```
