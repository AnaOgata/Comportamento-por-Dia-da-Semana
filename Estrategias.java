class SegundaEstrategia implements EstrategiaDia {
    public String executar(String usuario, String informacao) {
        return usuario + ", organize suas prioridades: \"" + informacao + "\".";
    }
    public String getPrioridade() { return "ALTA"; }
}

class TercaEstrategia implements EstrategiaDia {
    public String executar(String usuario, String informacao) {
        return usuario + ", avance nas tarefas pendentes: \"" + informacao + "\".";
    }
    public String getPrioridade() { return "ALTA"; }
}

class QuartaEstrategia implements EstrategiaDia {
    public String executar(String usuario, String informacao) {
        return usuario + ", revise o andamento de: \"" + informacao + "\".";
    }
    public String getPrioridade() { return "MÉDIA"; }
}

class QuintaEstrategia implements EstrategiaDia {
    public String executar(String usuario, String informacao) {
        return usuario + ", colabore com alguém da equipe em: \"" + informacao + "\".";
    }
    public String getPrioridade() { return "MÉDIA"; }
}

class SextaEstrategia implements EstrategiaDia {
    public String executar(String usuario, String informacao) {
        return usuario + ", registre o que foi concluído: \"" + informacao + "\".";
    }
    public String getPrioridade() { return "MÉDIA"; }
}

class SabadoEstrategia implements EstrategiaDia {
    public String executar(String usuario, String informacao) {
        return usuario + ", realize estudo livre ou descanso. Sugestão: \"" + informacao + "\".";
    }
    public String getPrioridade() { return "BAIXA"; }
}

class DomingoEstrategia implements EstrategiaDia {
    public String executar(String usuario, String informacao) {
        return usuario + ", planeje a próxima semana com foco em: \"" + informacao + "\".";
    }
    public String getPrioridade() { return "BAIXA"; }
}

class SemEstrategia implements EstrategiaDia {
    public String executar(String usuario, String informacao) {
        return "Dia inválido ou sem estratégia associada. Nenhuma ação executada.";
    }
    public String getPrioridade() { return "INDEFINIDA"; }
}