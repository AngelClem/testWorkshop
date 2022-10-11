import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;
import java.util.Objects;

public class User {

        int id;
        String mail;

        String passwd;
        Rank rank;
        List<Stuff> stuffList;

        public User(int id, String mail, String passwd, Rank rank, List<Stuff> stuffList) {
                this.id = id;
                this.mail = mail;
                this.passwd = passwd;
                this.rank = rank;
                this.stuffList = stuffList;
        }

        public User(String mail, String passwd, Rank rank, List<Stuff> stuffList) {
                this.mail = mail;
                this.passwd = passwd;
                this.rank = rank;
                this.stuffList = stuffList;
        }

        public User() {
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getMail() {
                return mail;
        }

        public void setMail(String mail) {
                this.mail = mail;
        }

        public String getPasswd() {
                return passwd;
        }

        public void setPasswd(String passwd) {
                this.passwd = passwd;
        }

        public Rank getRank() {
                return rank;
        }

        public void setRank(Rank rank) {
                this.rank = rank;
        }

        public List<Stuff> getStuffList() {
                return stuffList;
        }

        public void setStuffList(List<Stuff> stuffList) {
                this.stuffList = stuffList;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                User user = (User) o;
                return id == user.id && Objects.equals(mail, user.mail) && Objects.equals(passwd, user.passwd) && Objects.equals(rank, user.rank) && Objects.equals(stuffList, user.stuffList);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, mail, passwd, rank, stuffList);
        }

        @Override
        public String toString() {
                return "User{" +
                        "id=" + id +
                        ", mail='" + mail + '\'' +
                        ", passwd='" + passwd + '\'' +
                        ", rank=" + rank +
                        ", stuffList=" + stuffList +
                        '}';
        }



        public ObjectNode getJson(){
                ObjectMapper objectMapper = new ObjectMapper();
                ObjectNode result = objectMapper.createObjectNode();

                result.put("id", this.getId());

                return result;
        }
        public ObjectNode getJson(boolean lazy){
                ObjectMapper objectMapper = new ObjectMapper();
                ObjectNode result = objectMapper.createObjectNode();

                result.put("id", this.getId());
                result.put("rank", this.getRank().getId());

                return result;
        }
}
