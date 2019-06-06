<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
   
    <head>
        <link rel="stylesheet" href="index.css">
        <title>Registro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <body><font color="white"> <form action="registrado.htm" method="post">
            <br>
            <br>
           
            <br><center>
         Usuario: <input id="Usuario" name="Usuario" type="text" value="${user}" />
            <span style="color: red">${errorUser}</span></center>
            <br>
            <br>
            
            <br><center>
         Email:   <input id = "Correo" name ="Correo" type="text" name="Correo" value="${correo}" size="20" />
         <span style="color: red">${errorCorreo}</span></center> 
         <br>
         <table><tr>
             <br>
             
            <br><center>
         Fecha de nacimiento:
                 
                 Dia:  <select name="Dia">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                    <option>11</option>
                    <option>12</option>
                    <option>13</option>
                    <option>14</option>
                    <option>15</option>
                    <option>16</option>
                    <option>17</option>
                    <option>18</option>
                    <option>19</option>
                    <option>20</option>
                    <option>21</option>
                    <option>22</option>
                    <option>23</option>
                    <option>24</option>
                    <option>25</option>
                    <option>26</option>
                    <option>27</option>
                    <option>28</option>
                    <option>29</option>
                    <option>30</option>
                </select>   
            
            Mes: <select name="Mes">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                    <option>11</option>
                    <option>12</option>
                </select>
           
            Año: <select name="Anio">
                    <option>1982</option>
                    <option>1983</option>
                    <option>1984</option>
                    <option>1985</option>
                    <option>1986</option>
                    <option>1987</option>
                    <option>1988</option>
                    <option>1989</option>
                    <option>1990</option>
                    <option>1991</option>
                    <option>1992</option>
                    <option>1993</option>
                    <option>1994</option>
                    <option>1995</option>
                    <option>1996</option>
                    <option>1997</option>
                    <option>1998</option>
                    <option>1999</option>
                    <option>2000</option>
                    <option>2001</option>
                </select>
             </tr>
         </table>
         </center>
            <br>
            <br>
           
            <br><center>
            Password: <input id="Pass" name="Pass" type="password" value="${pass}" />
            <span style="color: red">${errorPass}</span>
            <br>
            <br>
            <br><input type="submit" value="Registrar" name="botonreg" /></div>
        </color></form>
            <br>
            <form action="index.htm" method="post"> 
         <br><input type="submit" value="Volver" name="p" /></div>
    </form>
            </center>
        </body>
   
</html>
