import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] alunos = new String[]{
                "Francyne",
                "Julia",
                "Bryan",
                "Camila",
                "Renata",
                "Samuel",
                "Gabriel",
                "Matheus",
                "Arthur",
                "Fernanda",
                "Emilly",
                "Miguel Henrique",
                "Verônica",
                "Graciella",
                "Maria Clara",
                "Sthela",
                "Henrique",
                "Milena",
                "Victor",
                "Eduarda",
                "Ana Clara",
                "Gabriel",
                "Ana Luisa",
                "Pedro",
                "Kemily",
                "Guilherme",
                "Miguel Serra",
                "Guilherme Silva",
                "Pedro Sampaio",
                "Nathan",
                "Rafaela",
                "Carlos Daniel",
                "Rita",
                "Renan",
                "Diego",
                "Isabela",
                "Murilo",
                "Caique",
                "Maiara",
                "Nathália",
                "Nicolas",
                "Kamily",
                "Wendel"
        };

        String path = "C:\\Users\\ljele\\IdeaProjects\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String linha : alunos) {
                bw.write(linha + ", ");
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}