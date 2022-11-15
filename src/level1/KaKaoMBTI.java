package level1;

public class KaKaoMBTI {

    public String solution(String[] survey, int[] choices) {

        Person person = new Person();
        int mid = 4;

        for (int i = 0; i < survey.length; i++) {

            String target = survey[i];

            if (target.startsWith("A")) {
                int who = choices[i] - mid;
                if (who > 0) {
                    person.setNeo(person.getNeo() + who);
                } else if (who < 0) {
                    person.setApeach(person.getApeach() + Math.abs(who));
                }
            }

            if (target.startsWith("N")) {
                int who = choices[i] - mid;
                if (who > 0) {
                    person.setApeach(person.getApeach() + who);
                } else if (who < 0) {
                    person.setNeo(person.getNeo() + Math.abs(who));
                }
            }

            if (target.startsWith("C")) {
                int who = choices[i] - mid;
                if (who > 0) {
                    person.setFrodo(person.getFrodo() + who);
                } else if (who < 0) {
                    person.setCorn(person.getCorn() + Math.abs(who));
                }
            }

            if (target.startsWith("F")) {
                int who = choices[i] - mid;
                if (who > 0) {
                    person.setCorn(person.getCorn() + who);
                } else if (who < 0) {
                    person.setFrodo(person.getFrodo() + Math.abs(who));
                }
            }

            if (target.startsWith("J")) {
                int who = choices[i] - mid;
                if (who > 0) {
                    person.setMuzi(person.getMuzi() + who);
                } else if (who < 0) {
                    person.setJayz(person.getJayz() + Math.abs(who));
                }
            }

            if (target.startsWith("M")) {
                int who = choices[i] - mid;
                if (who > 0) {
                    person.setJayz(person.getJayz() + who);
                } else if (who < 0) {
                    person.setMuzi(person.getMuzi() + Math.abs(who));
                }
            }

            if (target.startsWith("R")) {
                int who = choices[i] - mid;
                if (who > 0) {
                    person.setTube(person.getTube() + who);
                } else if (who < 0) {
                    person.setRion(person.getRion() + Math.abs(who));
                }
            }

            if (target.startsWith("T")) {
                int who = choices[i] - mid;
                if (who > 0) {
                    person.setRion(person.getRion() + who);
                } else if (who < 0) {
                    person.setTube(person.getTube() + Math.abs(who));
                }
            }
        }

        String answer = person.getMBTI();

        return answer;
    }

    private class Person {

        private int rion;
        private int tube;

        private int corn;
        private int frodo;

        private int jayz;
        private int muzi;

        private int apeach;
        private int neo;

        public int getRion() {
            return rion;
        }

        public int getTube() {
            return tube;
        }

        public int getCorn() {
            return corn;
        }

        public int getFrodo() {
            return frodo;
        }

        public int getJayz() {
            return jayz;
        }

        public int getMuzi() {
            return muzi;
        }

        public int getApeach() {
            return apeach;
        }

        public int getNeo() {
            return neo;
        }

        public void setRion(int rion) {
            this.rion = rion;
        }

        public void setTube(int tube) {
            this.tube = tube;
        }

        public void setCorn(int corn) {
            this.corn = corn;
        }

        public void setFrodo(int frodo) {
            this.frodo = frodo;
        }

        public void setJayz(int jayz) {
            this.jayz = jayz;
        }

        public void setMuzi(int muzi) {
            this.muzi = muzi;
        }

        public void setApeach(int apeach) {
            this.apeach = apeach;
        }

        public void setNeo(int neo) {
            this.neo = neo;
        }

        public String getMBTI() {
            StringBuilder sb = new StringBuilder();

            if (rion >= tube) {
                sb.append("R");
            } else {
                sb.append("T");
            }

            if (corn >= frodo) {
                sb.append("C");
            } else {
                sb.append("F");
            }

            if (jayz >= muzi) {
                sb.append("J");
            } else {
                sb.append("M");
            }

            if (apeach >= neo) {
                sb.append("A");
            } else {
                sb.append("N");
            }

            return sb.toString();
        }
    }

}
