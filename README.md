Modifiche recenti:

1 - Adesso Player ha il riferimento a PlayerCard (ho copiato il tuo codice)
ho solo aggiunto un metodo nella classe Player in modo che utilizzando il metodo addGoal della classe Match stampa la notifica del giocatore che ha fatto gol.

2 - Ho modificato il metodo addGoal, in modo che la prima volta imposti i valori di goalTeam ad 1, cosi non ci sono problemi.

N.B il metodo addGoal() non viene utilizzato in questa prima versione, ma è ottimo e sicuramente lo utilizzeremo nelle versioni future

3 - ho copiato il resto dei metodi che hai aggiunto e le ho unite alle correzioni che ho fatto al mio codice (per i metodi che hai aggiunto vale lo stesso discorso di addGoal())

4 - ho fatto alcuni test (che poi ho cancellato) per verificare che i metodi funzionano e non ho avuto nessun problema

5 - ho capito perchè mi dicevi che non aveva senso scrivere in quel modo la classe SoccerField, quindi ho riscritto tutti i metodi utili direttamente nelle altre classi
Adesso sto riscrivendo SoccerField come se fosse una classe Main reale (tutto viene visualizzato tramite system.out e i comandi vengono inseriti con system.in), non l'ho ancora caricato perchè non è completo.
Una volta terminato, mi dirai se può andare bene e se lo possiamo aggiungere. 
