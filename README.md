	Postanowiłem zbudować kalkulator przy pomocy designera w programie Eclipse. Moimi początkowymi założeniami było 
	stworzenie dwóch pól tekstowych, do których będzie się wprowadzać dane poprzez klawiaturę lub buttony gui. Następnie 
	zostanie wywołane działanie na obu wartościach (z prawego i lewego pola tekstowego) poprzez naciśniecie specjalnego 
	buttona w zaleznosci od wymaganego działania. 
	Po zbudowaniu dwóch pól tekstu oraz buttona zajmującego się dodawaniem napotkałem problem w actionPerformed. Polegał on 
	na tym, że jeżeli wprowadziło się coś innego niż liczby następował błąd w kompilatorze. Postanowiłem więc skorzystać z 
	internetu, by znaleźć odpowiedź jak to naprawić. Z informacji w internecie wynikło, że należy użyć bloku try/catch, by 
	uniknąć błędu. Rada poskutkowała a w wyjątku wstawiłem wyskakujące okienko podpowiadające użytkownikowi programu, by 
	wprowadzać tylko liczby.
	Następną rzeczą, jaką zacząłem implementować to buttony, dzięki którym można by wprowadzać liczby do pól tekstowych. 
	Pojawił się tam kolejny problem. Moim pierwszym założeniem było przykładowo przy liczbie jeden zmienić pole tekstowe na 
	jeden (setText(„1”)). Przy teście okazało się, że działa to nie do końca jakbym chciał, gdyż pole tekstowe zmieniało się 
	co prawda na 1, lecz nie można było dodać do niego kolejnej jedynki, ponieważ jak sobie zdałem sprawę pole było ustawiane 
	na wartość 1, a nie dodawane o tą wartość. Po raz kolejny zajrzałem do internetu i dowiedziałem się, żeby zamienić 
	wartość pola tekstowego na string. Zrobiłem jak napisali po czym za pomocą StringBuildera i metody append dodałem 
	wartość „1” do nowo utworzonego obiektu. Następnie obiekt zamieniłem ponownie na string który ustawiłem, by wyświetlał 
	się w polu tekstowym. 
	Do przycisku z przecinkiem postanowiłem użyć bloku if, ponieważ nie może być dwóch takich znaków.  Resztę operacji 
	powieliłem i obyło się bez problemów. 

	Po dodaniu w późniejszym okresie dodatkowych metod w programie Konwerter stwierdziłem, że to samo rozwiązanie 
	przyniosłoby korzyści również w tym programie. Utworzyłem więc dwie metody: NumberButtons do lewego panelu i 
	NumberButtons2 do prawego. Obie zawierały instrukcje co ma robić dany przycisk. W parametrze znajdowała się jedynie 
	string z cyfrą, jaka ma być dodana. Po zastosowaniu tych metod kod stał się trochę bardziej przejrzysty oraz skrócił 
	się o 100 linii. 

Stara wersja kryje się pod nazwą „Guiii”
