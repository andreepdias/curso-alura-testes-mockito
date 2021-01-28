package leilao;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class HelloWorldMockito {

    @Test
    void hello(){
        LeilaoDao mock = mock(LeilaoDao.class);
        List<Leilao> todos = mock.buscarTodos();
        assertTrue(todos.isEmpty());
    }

}
