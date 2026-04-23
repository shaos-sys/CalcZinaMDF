# Sistrema de precificação de serviços de usinagem em MDF.

Esté é um sistema em Java para calcular o preço de serviços de usinagem feitos em MDF, fazendo conversões de milímetros para metros quadrados. 
O sistema leva como base o preço do metro quadrado do MDF, por exemplo, R$ 128,57 para 1m² de MDF. Os preços são determinados com base no preço
real do MDF no mercado atual.

# Contexto:

O MDF é um painel de fibra de madeira de média densidade com superfície lisa, é um material muito versátil permintindo cortes em várias direções, molduras e usinagem. Diversas peças
de MDF, confeccionadas para uma infinidade de usos são feitas utilizando máquinas CNC (Comando Numérico Computadorizados), que são ferramentas automatizadas que utilizam Codigos G para 
controlar os eixos e ferramentas com alta precisão. 

Na prática, muitos trabalhadores autônomos enfrentam dificuldades na hora de precificar o seu trabalho, principalmente ao considerar medidas personalizadas de corte.
O objetivo deste projeto, é facilitar esse processo, permitindo calcular rapidamente esse valor com base nas dimensões e no tipo de MDF utilizado.


## O usuário pode:
- Escolher o tipo de MDF (3mm ou 6mm).
- Definir dimensões (altura e largura).
- Calcular o preço com base nas medidas.

## Funcionalidades:
- Menu interativo no terminal.
- Submenu de escolha do tipo de MDF.
- Cálculo da área, convertendo as medidas em milímetros para metros quadrados.
- Precificação baseada nas medidas definidas.

## Exemplo de uso:
====== MENU ======
1. Definir medidas.
2. Ver preço.
3. Sair.

Escolha uma opção: 1

## Melhorias futuras:
- Interface gráfica (GUI).
- Mais tipos de MDF e outros materias como acrícilo.
- Refatoração com herança e polimorfismo.
- Sistema de submenu para alterar o preço de referência.

## Autor: 
Hélio Souza.


