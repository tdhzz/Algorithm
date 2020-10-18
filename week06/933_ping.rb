class RecentCounter
    def initialize()
      @vs = []
    end
=begin
    :type t: Integer
    :rtype: Integer
=end
   def ping(t)
      @vs << t 
      @vs.shift until t - @vs.first <= 3000
      @vs.size
    end
end

