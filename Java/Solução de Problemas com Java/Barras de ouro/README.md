<div><div>
<h2>Desafio</h2>

<p>O feudo da Mesopotâmia é rico e o povo é cordial e alegre. Mas quando o assunto são&nbsp;impostos, é praticamente um roubo. Todo final de ano, cada feudo do país deve pagar uma determinada quantidade de quilos de ouro em impostos. Quando é chegado o momento de coletar os impostos, o Rei envia sua carruagem real para recolher o ouro devido, usando as estradas do reino.</p>

<p>Cada estrada liga dois feudos diferentes e podem ser percorridos em duas direções. Com as estradas é possível ir de um feudo a outro, possivelmente passando por feudos intermediários. Mas há apenas um caminho entre dois feudos diferentes.</p>

<p>Em cada feudo há um cofre real, utilizado para armazenamento do ouro de impostos. Os cofres reais são imensos, de forma que cada cofre tem capacidade de armazenar todo o ouro devido por todo o reino. A carruagem sai do feudo principal, percorrendo as estradas do reino, visitando os feudos para recolher o ouro devido, podendo usar qualquer cofre real para armazenar temporariamente uma parte do imposto recolhido, se necessário. Ao final da coleta, todo o ouro devido por todas os feudos devem estar armazenados no cofre real do feudo principal.</p>

<p>José como é o Rei, contratou o seu time para, dados a quantidade de ouro a ser recolhido em cada feudo (em kg), a lista das estradas do reino, com os respectivos comprimentos (em km) e a capacidade de carga da carruagem real (em kg), determine qual é a mínima distância que a carruagem deve percorrer para recolher todo o ouro devido.</p>

<h2>Entrada</h2>

<p>A primeira linha contém dois inteiros <strong>N</strong>&nbsp;e C indicando respectivamente o número de cidades e a capacidade de carga da carruagem (2 ≤ <strong>N</strong>&nbsp;≤ 104 e 1 ≤ C ≤ 100). O feudo principal é identificado pelo número 1 e os outros feudos são identificadas por inteiros de 2 a N . A segunda linha contém N inteiros Ei representando a quantidade de imposto devido por cada feudo&nbsp;i (0 ≤ Ei ≤ 100 para 1 ≤ i ≤ N ). Cada uma das N-1 linhas seguintes contém três inteiros A , B e C , indicando que uma estrada liga o feudo&nbsp;A e o feudo&nbsp;B (1 ≤ A, B ≤ N ) e tem comprimento C (1 ≤ C ≤ 100).</p>

<h2>Saída</h2>

<p>Seu programa deve produzir uma única linha com um inteiro representando a menor distância que a carruagem real deve percorrer para recolher todo o imposto devido, em km.</p>
</div>

<div>&nbsp;</div>

<table>
	<thead>
		<tr>
			<td>Exemplos de Entrada</td>
			<td>Exemplos de Saída</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>6 10</p>

			<p>0 10 10 10 10 10</p>

			<p>1 4 7</p>

			<p>5 1 2</p>

			<p>3 5 3</p>

			<p>2 5 2</p>

			<p>6 5 2</p>
			</td>
			<td>
			<p>44</p>
			</td>
		</tr>
	</tbody>
</table>

<div>
<table>
</table>
</div>

<div>&nbsp;</div>

<table>
	<thead>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>5 9</p>

			<p>5 2 6 3 6</p>

			<p>1 2 1</p>

			<p>2 3 1</p>

			<p>2 4 1</p>

			<p>2 5 1</p>
			</td>
			<td>
			<p>10</p>
			</td>
		</tr>
	</tbody>
</table> <br><br></div>