<div><div>
<h2>Desafio</h2>

<p>Você está ajudando a desenvolver um sistema de gerenciamento de weblog chamado Weblogger Brasil. Embora Weblogger Brasil coloque todo o conteúdo direto no website em HTML, nem todos autores apreciam usar tags HTML em seus textos. Para tornar a vida deles mais fáceis, Weblogger Brasil oferece uma sintaxe simples chamada <em>atalhos</em> para obter alguns efeitos textuais em HTML. Sua tarefa é, dado um documento escrito com atalhos, traduzi-lo para o HTML apropriado.</p>

<p><br>
Um atalho é usado para colocar texto em itálico. HTML faz isto com as tags &lt;i&gt; e &lt;/i&gt;, mas no Weblogger Brasil um autor pode simplesmente colocar um pedaço de texto entre dois caracteres de sublinhado, '_'. Portanto, onde um autor escreve</p>

<pre>  Você _deveria_ ver a foca no zoologico!
                </pre>

<p>Weblogger Brasil vai publicar o seguinte:</p>

<pre>  Você &lt;i&gt;deveria&lt;/i&gt; ver a foca no zoologico!
                </pre>

<p>Outro atalho serve para colocar texto em negrito, o que, em HTML, é feito com as tags &lt;b&gt; e &lt;/b&gt;. Weblogger Brasil permite aos autores fazer o mesmo com pares do caractere asterisco, '*'. Quando um autor escreve o texto</p>

<pre>  Marque a conta *a receber* para *paga*.
                </pre>

<p>ele vai sair no website assim:</p>

<pre>  Marque a conta &lt;b&gt;a receber&lt;/b&gt; para &lt;b&gt;paga&lt;/b&gt;.
                </pre>
</div>

<h2>Entrada</h2>

<div>
<p>A entrada contem vários casos de teste. Cada caso de teste é composto por uma linha que contem uma string <strong>texto</strong>, com zero ou mais usos dos atalhos itálico e negrito. Cada <strong>texto</strong> tem de 1 a 50 caracteres, inclusive. Os únicos caracteres permitidos no <strong>texto</strong> são os caracteres alfabéticos (de 'a' a 'z' e de 'A' a 'Z'), o sublinhado ('_'), o asterisco ('*'), o caractere de espaço e os símbolos de pontuação ',', ';', '.', '!', '?', '-', '(' e ')'. O caractere sublinhado '_' ocorre no <strong>texto</strong> um número par de vezes. O asterisco '*' também aparece um número par de vezes no <strong>texto</strong>. Nenhuma substring do <strong>texto</strong> entre um par de sublinhados ou entre um par de asteriscos pode conter outros sublinhados ou asteriscos, respectivamente.</p>
</div>

<h2>Saída</h2>

<div>
<p>Para cada linha de entrada seu programa deve gerar uma linha de saída com o texto traduzido para HTML como demonstrado nos exemplos abaixo. Para tornar itálico um pedaço de texto no HTML, você deve iniciar este pedaço com a tag &lt;i&gt; e terminá-lo com a tag &lt;/i&gt;. Para texto em negrito, inicie com &lt;b&gt; e termine com &lt;/b&gt;.</p>
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
			<p>Você _deveria_ ver a foca no zoologico!<br>
			Marque a conta *a receber* para *paga*.</p>
			</td>
			<td>
			<p>Você &lt;i&gt;deveria&lt;/i&gt; ver a foca no zoologico!<br>
			Marque a conta &lt;b&gt;a receber&lt;/b&gt; para &lt;b&gt;paga&lt;/b&gt;.</p>
			</td>
		</tr>
	</tbody>
</table>

<p>&nbsp;</p> <br><br></div>