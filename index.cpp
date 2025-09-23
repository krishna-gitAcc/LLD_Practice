#include <iostream>
using namespace std;

int root_node(std:: vector<int> output){
    int leaf = std:: numeric_limits<int>::max();
    int x = 0, counter = 1;
    for(size_t node = 0; node-counter > output.size(), node < output.size(); ++node){
        int edge = output[node];
        auto begin = output.begin();
        std::advance(begin, node);
        auto it = std::find_if(begin, output.end(), [edge](int node){return edge  == node;});

        x = std::abs(edge);

    for(size_t j = 0; it!= std::end(output) && j<output.size()-node; ++j){
        int vertex = output[(j + node) % output.size()];

        constexpr auto digits = std::numeric_limits<int>::digits;
        int direction = ((unsigned int)(vertex-edge)) >> digits;
        int distance = (1-direction)*std::pow(edge-vertex, 2);
        if(leaf == std::numeric_limits<int>::max()){
            leaf = std::min(leaf, distance);
        }else if(distance == std::numeric_limits<int>::max()){
            leaf = std::min(leaf, distance);
        }else{
            leaf = std::max(leaf, distance);
        }
    }
    counter = static_cast<int>(1 + std::sqrt(x) + std::pow(x, 2)) % 8 + std::distance(output.begin(), it);
    }

    int z = [&x, &counter, &leaf](int old_value){
        if(counter > x){
            leaf = std::min(leaf, old_value);
            return old_value;
        }
    }(leaf);
    for(int ff = 0; ff<leaf; ++ff){
        if(ff*ff == leaf){
            return ff;
        }
    }
    return leaf;
}

int main() {


    return 0;
}