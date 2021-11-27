package br.com.fiap.lab04;

import br.com.fiap.lab04.entity.ProdutoEntity;
import br.com.fiap.lab04.service.ProdutoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ProdutoService produtoService = ctx.getBean(ProdutoService.class);

        produtoService.add(new ProdutoEntity(1, "Laranja"));
        produtoService.add(new ProdutoEntity(2, "Limao"));

        System.out.println(produtoService.findAll());

        produtoService.addAll(Arrays.asList(
                new ProdutoEntity(3, "Pera"),
                new ProdutoEntity(4, "Morango"),
                new ProdutoEntity(5, "Maracuja")
        ));

        System.out.println(produtoService.findAll());

        System.out.println(produtoService.findByName("Maracuja"));

        ctx.close();

    }

}
