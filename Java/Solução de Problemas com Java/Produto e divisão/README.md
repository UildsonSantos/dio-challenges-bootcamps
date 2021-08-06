<div><div>
<h2>Desafio</h2>

<p>Você tem a obrigação&nbsp;de testar as calculadores, para que&nbsp;façam&nbsp;apenas operações de multiplicação e divisão. Além disso, o termo a ser digitado em cada operação,&nbsp;(o número exibido no visor que será dividido ou multiplicado), só pode conter um único dígito.</p>

<p>Quando ligada, a calculadora exibe o número 1. Após isso, o usuário pode digitar um número com um único dígito e escolher se esse número deve multiplicar ou dividir o número exibido anteriormente; o resultado da operação escolhida é então exibido na calculadora. Pode-se repetir esse processo quantas vezes quiser.</p>

<p>Apesar de ser permitido apenas números inteiros de um dígito, a calculadora permite exibir números com múltiplos dígitos e até mesmo números fracionários.</p>

<p>Apresentada a sequência de operações realizadas logo depois de ligada, seu objetivo é conferir o resultado exibido.</p>

<p>No primeiro caso de teste abaixo,&nbsp;o&nbsp;usuário deseja calcular o resultado da seguinte expressão: 1 × 2 × 1 × 3. Note que a primeira ocorrência do número 1 vem do fato da calculadora mostrar inicialmente 1 ao invés de 0.</p>

<p>No segundo caso de teste abaixo,&nbsp;o usuário deseja calcular o resultado da seguinte expressão: ((1/2)/3) × 6.</p>
</div>

<h2>Entrada</h2>

<div>
<p>A primeira e única linha da entrada contém um inteiro&nbsp;<strong><em>N </em></strong><em>(</em>1 ≤&nbsp;<strong><em>N</em></strong>&nbsp;≤ 100 000). Cada uma das próximas&nbsp;<strong><em>N</em></strong>&nbsp;linhas contém um dígito e um caractere '*' ou '/', que representam uma operação realizada na calculadora.</p>
</div>

<h2>Saída</h2>

<div>
<p>O programa deve imprimir uma única linha contendo o resultado que deve ser exibido pela calculadora ao final de todas as operações.</p>
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
			<p>3</p>

			<p>2 *</p>

			<p>1 *</p>

			<p>3 *</p>
			</td>
			<td>
			<p>6</p>
			</td>
		</tr>
	</tbody>
</table>

<div>&nbsp;</div>

<table>
	<thead>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>3</p>

			<p>2 /</p>

			<p>3 /</p>

			<p>6 *</p>
			</td>
			<td>
			<p>1</p>
			</td>
		</tr>
	</tbody>
</table>

<div>&nbsp;</div>

<table>
	<thead>
	</thead>
	<tbody>
		<tr>
			<td>
			<p>11</p>

			<p>9 *</p>

			<p>9 *</p>

			<p>9 *</p>

			<p>9 *</p>

			<p>9 *</p>

			<p>9 *</p>

			<p>9 *</p>

			<p>9 *</p>

			<p>9 *</p>

			<p>9 *</p>

			<p>9 /</p>
			</td>
			<td>
			<p>387420489</p>
			</td>
		</tr>
	</tbody>
</table> <br><br></div>