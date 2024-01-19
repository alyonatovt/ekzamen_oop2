    class Two extends One {
        int k;

        public (int j, int k) {
            super(j);
            this.k = k;
        }
        
        public int calculateSum() {
            return super.j + this.k;
        }
        public int getParentJ() {
            return super.j;
        }
    }

