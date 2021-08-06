<div><div>
<h2>Desafio</h2>

<p>Nas férias de Dezembro, várias escolas&nbsp;se organizam&nbsp;e levam&nbsp;seus alunos para um acampamento de férias por uma semana. Nestes acampamentos os alunos são divididos em cabanas coletivos por gênero e idade, sempre com um adulto&nbsp;que, além de dormir&nbsp;com o grupo no cabana, também são responsáveis por criar e executar várias atividades, como por exemplo&nbsp;jogos, excursões, Gincanas Noturnas, etc.</p>

<p>No primeiro dia foi realizada uma gincana&nbsp;em que a atividade constituia em&nbsp;agrupar os alunos&nbsp;em um círculo (organizado no sentido anti-horário) do qual seriam retiradas uma a uma até que sobrasse apenas um aluno, que seria o vencedor.<br>
<br>
No momento em que entra no círculo, cada aluno recebe uma pequena ficha que contém um valor de 1 a 500. Depois que o círculo é formado, conta-se, iniciando no aluno&nbsp;que está ao lado da primeira que entrou no círculo, o número correspondente à ficha que o&nbsp;primeiro&nbsp;detém. O aluno&nbsp;onde o número contado cair, deve ser retirado&nbsp;do grupo, e a contagem inicia novamente segundo a ficha do aluno&nbsp;que acabou de ser eliminado. Para ficar mais interessante, quando o valor que consta na ficha é par, a contagem é feita no sentido horário e quando o valor que consta na ficha é ímpar, a contagem é feita no sentido anti-horário.<br>
<br>
Desenvolva um programa para que no próximo evento o responsável pela brincadeira&nbsp;saiba previamente qual criança irá ser a vencedora de cada grupo, com base nas informações fornecidas.</p>
</div>

<h2>Entrada</h2>

<div>
<p>A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro <strong>N</strong> (1 ≤ <strong>N</strong> ≤ 100), indicando a quantidade de alunos que farão parte de cada círculo. Em seguida, as <strong>N</strong> linhas de cada caso de teste conterão duas informações, o <strong>Nome</strong> e o <strong>Valor</strong> (1 ≤ <strong>Valor</strong> ≤ 500) que consta na ficha de cada aluno, separados por um espaço, na ordem de entrada na formação do círculo inicial.<br>
<br>
OBS: O <strong>Nome</strong> de cada aluno não deverá ultrapassar 30 caracteres e contém apenas letras maiúsculas e minúsculas, sem acentos, e o caractere “_”. O final da entrada é indicado pelo número zero.</p>
</div>

<h2>Saída</h2>

<div>
<p>Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx, com um espaço após o sinal ":" indicando qual é o&nbsp;aluno do grupo que venceu a brincadeira.</p>
</div>

<div>&nbsp;</div>

<table>
	<thead>
		<tr>
			<td>Exemplo de Entrada</td>
			<td>Exemplo de Saída</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>3<br>
			Fernanda 7<br>
			Fernando 9<br>
			Gustavo 11<br>
			5<br>
			Maria 7<br>
			Pedro 9<br>
			Joao_Vitor 5<br>
			Isabel 12<br>
			Laura 8<br>
			3<br>
			Maria 4<br>
			Pedro 3<br>
			Joao 2<br>
			0</p>
			</td>
			<td>
			<p>Vencedor(a): Fernanda<br>
			Vencedor(a): Pedro<br>
			Vencedor(a): Pedro</p>
			</td>
		</tr>
	</tbody>
</table> <br><br></div>