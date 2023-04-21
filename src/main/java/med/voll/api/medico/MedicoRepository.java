package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

//O primeiro será o tipo da entidade trabalhada pelo repository, Medico, e o tipo do atributo da chave primária da entidade, Long.
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
