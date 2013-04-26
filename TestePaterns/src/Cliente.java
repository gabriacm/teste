/**
* Abstra��o de uma Aplica��o capaz de manipular
* documentos.
*/
  abstract class Aplicacao {
 
      private Documento doc;
 
      /**
      * Abstra��o do Factory Method
      */
       abstract Documento criaDocumento();
 
       void novoDocumento() {
           this.doc = this.criaDocumento();
       }
 
       void abrirDocumento() {
           this.doc.abrir();
       }
  }
 
/**
* Abstra��o de um Documento.
*/
  abstract class Documento {
 
      void abrir() {
          System.out.println("Documento:Abrir documento!");
      }
 
      void fechar() {
          System.out.println("Documento:Fechar documento!");
      }
 
      void gravar() {
          System.out.println("Documento:Gravar documento!");
      }
  }
 
/**
* Esta classe concreta cont�m a implementa��o
* de uma aplica��o capaz de manipular documentos
* do tipo MeuDocumento.
*/
  class MinhaAplicacao extends Aplicacao {
 
        /**
         * Uma implementa��o do Factory Method. Este m�todo � 
         * especializado na cria��o de documentos do tipo MeuDocumento
         */
        Documento criaDocumento() {
            return new MeuDocumento();
        }
  }
 
/**
* Esta classe concreta cont�m a implementa��o
* de um tipo de documento espec�fico.
*/
  class MeuDocumento extends Documento {
 
  }