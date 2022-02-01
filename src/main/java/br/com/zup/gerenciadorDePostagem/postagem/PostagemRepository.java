package br.com.zup.gerenciadorDePostagem.postagem;

import br.com.zup.gerenciadorDePostagem.enums.Area;
import br.com.zup.gerenciadorDePostagem.enums.Tema;
import br.com.zup.gerenciadorDePostagem.enums.Tipo;
import br.com.zup.gerenciadorDePostagem.usuario.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostagemRepository extends CrudRepository<Postagem,Long> {
    List<Postagem> findAllByArea (Area area);
    List<Postagem> findAllByTipo (Tipo tipo);
    List<Postagem> findAllByTema (Tema tema);
    List<Postagem> findAllByTema (Usuario autorPostagem);


}
