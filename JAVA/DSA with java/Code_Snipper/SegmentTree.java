package Code_Snipper;

 class SegmentTree{


        int[] seg;

        SegmentTree(int n){
            seg=new int[4*n];
        }

        void Build(int indx,int low,int high,int[] arr){
            if(low==high){
                seg[indx]=arr[low];
                return ;
            }

            int mid=low+(high-low)/2;

            Build(2*indx+1,low,mid,arr);
            Build(2*indx+2,mid+1,high,arr);
            seg[indx]=(seg[2*indx+1]+seg[2*indx+2]);
        }

        int query(int indx,int low,int high,int L,int R){
            // no overlapping
            if(R<low || high<L) return 0;

            // complete overlapping
            if(low>=L && high<=R) return seg[indx];

            // partial overlapping
            int mid=low+(high-low)/2;
            int left=query(2*indx+1,low,mid,L,R);
            int right=query(2*indx+2,mid+1,high,L,R);

            return left+right;
        }

        void update(int indx,int low,int high,int Indexupdate,int val){

            if(low==high){
                seg[indx]=val;
                return ;
            }

            int mid=low+(high-low)/2;
            if(Indexupdate<=mid) update(2*indx+1,low,mid,Indexupdate,val);
            else update(2*indx+2,mid+1,high,Indexupdate,val);
            seg[indx]=(seg[2*indx+1]+seg[2*indx+2]);
        }
    }